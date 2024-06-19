package Utilitários;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ConexaoCi {
    Connection conn;
    
    public int AdicionarFuncionario(DTO.FuncionarioDTO funcionarioDTO){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try {
                String sql = "INSERT INTO funcionarios (Funcao, Nome, CPF, DataNascimento, Sexo, Usuario, Senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, funcionarioDTO.getFuncao());
                pstm.setString(2, funcionarioDTO.getNome());
                pstm.setString(3, funcionarioDTO.getCPF());
                pstm.setString(4, funcionarioDTO.getDataNascimento());
                pstm.setString(5, funcionarioDTO.getSexo());
                pstm.setString(6, funcionarioDTO.getUsuario());
                pstm.setString(7, funcionarioDTO.getSenha());

                int rs = pstm.executeUpdate();

                ResultSet generatedKeys = pstm.getGeneratedKeys();
                if (generatedKeys.next()) {
                    funcionarioDTO.setCodigo(generatedKey = generatedKeys.getInt(1));
                }
                return rs;
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }
    }
    
    public int AdicionarCliente(DTO.ClienteDTO clienteDTO){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try {
                String sql = "INSERT INTO clientes (Nome, CPF, Telefone, dataNascimento, Sexo) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, clienteDTO.getNome());
                pstm.setString(2, clienteDTO.getCPF());
                pstm.setString(3, clienteDTO.getTelefone());    
                pstm.setString(4, clienteDTO.getdata_nascimento()); 
                pstm.setString(5, clienteDTO.getSexo()); 
                int rs = pstm.executeUpdate();
                ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    clienteDTO.setIdcliente(generatedKey = rsa.getInt(1));   
                }  
                return rs;
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            } 
     }
    
    public int AdicionarEstoque(DTO.ProdutoDTO produtoDTO){
        if (produtoDTO.getQuantidade() > 0){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try{
                String sql = "Insert into estoque (Produto, Tamanho, Quantidade, Preco) Values (?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, produtoDTO.getNome());
                pstm.setString(2, produtoDTO.getTamanho());
                pstm.setInt(3, produtoDTO.getQuantidade());
                pstm.setDouble(4, produtoDTO.getPreco());
                int rs = pstm.executeUpdate();
                ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    produtoDTO.setCodigo(generatedKey = rsa.getInt(1));   
                }  
                return rs;
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            } 
        }else{
            return -1;
        }
    }
    
    public int AdicionarRegistro(DTO.ProdutoDTO produtoDTO, DTO.ClienteDTO clienteDTO){
        conn = new ConexaoBD().ConectaBD();   
        int generatedKey = -1;
        try{
            //Adiciona os daods ao banco
            String sql = "Insert into registro (Data, Cliente, Telefone, CPF, Produto, Tamanho, Quantidade, Total) Values (?, ?, ?, ?, ?, ?, ?, ?)";
            LocalDate dataAtual = LocalDate.now();
            PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pstm.setObject(1, dataAtual);
            pstm.setString(2, clienteDTO.getNome());
            pstm.setString(3, clienteDTO.getTelefone());
            pstm.setString(4, clienteDTO.getCPF());
            pstm.setString(5, produtoDTO.getNome());
            pstm.setString(6, produtoDTO.getTamanho());
            if (produtoDTO.getQuantidade() > 0){
                pstm.setInt(7, produtoDTO.getQuantidade());
            }
            pstm.setDouble(8, produtoDTO.getTotal());
            
            int rs = pstm.executeUpdate();
            ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    DTO dto = new DTO();
                    DTO.RegistroDTO registroDTO = dto.new RegistroDTO();
                    registroDTO.setNotaFiscal(generatedKey = rsa.getInt(1));   
                } 
            return rs;

                
            }catch (SQLException erro){
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }  
    }
    
    public Boolean VerificarEstoque(DTO.ProdutoDTO produtoDTO){
        if (produtoDTO.getQuantidade() > 0){
            conn = new ConexaoBD().ConectaBD();       
            try{
                String sql = "Select Produto, Tamanho, Quantidade, Preco from estoque where Codigo = ?";
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.setInt(1, produtoDTO.getCodigo());   

                ResultSet rs = pstm.executeQuery(); 
                if (rs.next()){
                    if (rs.getInt("Quantidade") >= produtoDTO.getQuantidade()){
                        produtoDTO.setNome(rs.getString("Produto"));
                        produtoDTO.setTamanho(rs.getString("Tamanho"));
                        produtoDTO.setPreco(rs.getDouble("Preco"));       
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null, "ERRO: Quantidade indisponível no estoque."); 
                        return false;
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "ERRO: Produto inexistente."); 
                    return false;
                }   
            }catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage());
                return false;
            }    
        }else{
            return false;
        }
    }
    
    public Boolean VerificarCliente(DTO.ClienteDTO clienteDTO){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT * FROM clientes WHERE CPF = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, clienteDTO.getCPF());  
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }
    public Boolean VerificarAtendente(DTO.FuncionarioDTO dadosDTO){
        conn = (Connection) new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT usuario, senha FROM funcionarios WHERE funcao =  'Atendente' and usuario =? and senha =?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dadosDTO.getUsuario());
            pstm.setString(2, dadosDTO.getSenha()); 
            
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }

    public Boolean VerificarAdministrador(DTO.FuncionarioDTO dadosDTO){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT usuario, senha FROM funcionarios WHERE funcao =  'Administrador' and usuario =? and senha =?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dadosDTO.getUsuario());
            pstm.setString(2, dadosDTO.getSenha()); 
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }

    public Boolean VerificarGerente(DTO.FuncionarioDTO dadosDTO){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "SELECT usuario, senha FROM funcionarios WHERE funcao =  'Gerente' and usuario =? and senha =?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dadosDTO.getUsuario());
            pstm.setString(2, dadosDTO.getSenha()); 
            
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){       
                return true;   
            }else{
                return false; 
            }
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            return false;
        }
    }
}
