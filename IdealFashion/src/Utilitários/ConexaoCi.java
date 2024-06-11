package Utilitários;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class ConexaoCi {
    Connection conn;
    
    public int AdicionarFuncionario(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();
        try{
            String sql = "Insert into Funcionarios (Funcao, Nome, CPF, DataNascimento, Sexo, Usuario, Senha) Values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusdto.getFuncaoFuncionario());
            pstm.setString(2, objusdto.getNomeFuncionario());
            pstm.setString(3, objusdto.getCPFFuncionario());
            pstm.setString(4, objusdto.getDataNascimentoFuncionario());
            pstm.setString(5, objusdto.getSexoFuncionario());
            pstm.setString(6, objusdto.getUsuarioFuncionario());
            pstm.setString(7, objusdto.getSenhaFuncionario());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){
            //JOptionPane.showMessageDialog(null, erro.getMessage());
            return -1;
        }
    }
    
    public int AdicionarEstoque(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();
        try{
            String sql = "Insert into Estoque (Produto, Tamanho, Quantidade, Preco) Values (?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusdto.getProdutoEstoque());
            pstm.setString(2, objusdto.getTamanhoEstoque());
            pstm.setInt(3, objusdto.getQuantidadeEstoque());
            pstm.setDouble(4, objusdto.getPrecoEstoque());
            
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){
            //JOptionPane.showMessageDialog(null, erro.getMessage());
            return -1;
        }
    }
    
    public int AdicionarRegistro(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "Insert into Registro (Data, Cliente, Telefone, CPF, Produto, Tamanho, Quantidade, Total) Values (?, ?, ?, ?, ?, ?, ?, ?)";
            LocalDate dataAtual = LocalDate.now();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setObject(1, dataAtual);
            pstm.setString(2, objusdto.getClienteRegistro());
            pstm.setString(3, objusdto.getTelefoneRegistro());
            pstm.setString(4, objusdto.getCPFRegistro());
            pstm.setString(5, objusdto.getProdutoRegistro());
            pstm.setString(6, objusdto.getTamanhoRegistro());
            pstm.setInt(7, objusdto.getQuantidadeRegistro());
            pstm.setDouble(8, objusdto.getTotalRegistro());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){
            //JOptionPane.showMessageDialog(null, erro.getMessage());
            return -1;
        }
    }
    
    public Boolean VerificarEstoque(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "Select Produto, Preco from Estoque where Codigo = ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusdto.getCodigoProduto());   
            
            ResultSet rs = pstm.executeQuery();
            if (rs.next()){
                UsuarioDTO AdicionarDados = new UsuarioDTO();
                String Produto = rs.getString("Produto");
                Double Preco = rs.getDouble("Preco");
                AdicionarDados.setProdutoProduto(Produto);
                AdicionarDados.setPrecoProduto(Preco);
                return true; 
            }
        }catch (SQLException erro) {
            //JOptionPane.showMessageDialog(null, "Falha no cadastro." + erro.getMessage());
        }
        return false;
    }
}
