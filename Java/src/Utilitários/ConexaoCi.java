package Utilitários;
import Administrador.Estoque;
import Atendente.Registro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConexaoCi {
    Connection conn;
    
    public int AdicionarFuncionario(UsuarioDTO objusdto){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try {
                String sql = "INSERT INTO Funcionarios (Funcao, Nome, CPF, DataNascimento, Sexo, Usuario, Senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, objusdto.getFuncaoFuncionario());
                pstm.setString(2, objusdto.getNomeFuncionario());
                pstm.setString(3, objusdto.getCPFFuncionario());
                pstm.setString(4, objusdto.getDataNascimentoFuncionario());
                pstm.setString(5, objusdto.getSexoFuncionario());
                pstm.setString(6, objusdto.getUsuarioFuncionario());
                pstm.setString(7, objusdto.getSenhaFuncionario());

                int rs = pstm.executeUpdate();

                ResultSet generatedKeys = pstm.getGeneratedKeys();
                if (generatedKeys.next()) {
                    objusdto.setCodigoFuncionario(generatedKey = generatedKeys.getInt(1));
                }
                return rs;
            } catch (SQLException erro) {
                //JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }
    }
    
    public int AdicionarEstoque(UsuarioDTO objusdto){
            conn = new ConexaoBD().ConectaBD();
            int generatedKey = -1;
            try{
                String sql = "Insert into Estoque (Produto, Tamanho, Quantidade, Preco) Values (?, ?, ?, ?)";
                PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                pstm.setString(1, objusdto.getProdutoEstoque());
                pstm.setString(2, objusdto.getTamanhoEstoque());
                pstm.setInt(3, objusdto.getQuantidadeEstoque());
                pstm.setDouble(4, objusdto.getPrecoEstoque());

                int rs = pstm.executeUpdate();
                ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    objusdto.setCodigoEstoque(generatedKey = rsa.getInt(1));   
                }  
                return rs;
            }catch (SQLException erro){
                //JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }   
    }
    
    public int AdicionarRegistro(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();   
        int generatedKey = -1;
        try{
            String sql = "Insert into Registro (Data, Cliente, Telefone, CPF, Produto, Tamanho, Quantidade, Total) Values (?, ?, ?, ?, ?, ?, ?, ?)";
            LocalDate dataAtual = LocalDate.now();
            PreparedStatement pstm = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pstm.setObject(1, dataAtual);
            pstm.setString(2, objusdto.getClienteRegistro());
            pstm.setString(3, objusdto.getTelefoneRegistro());
            pstm.setString(4, objusdto.getCPFRegistro());
            pstm.setString(5, objusdto.getProdutoRegistro());
            pstm.setString(6, objusdto.getTamanhoRegistro());
            pstm.setInt(7, objusdto.getQuantidadeRegistro());
            pstm.setDouble(8, objusdto.getTotalRegistro());
            
            int rs = pstm.executeUpdate();
            ResultSet rsa = pstm.getGeneratedKeys();
                if (rsa.next()) {
                    objusdto.setNotaFiscalRegistro(generatedKey = rsa.getInt(1));   
                }  
                return rs;

                
            }catch (SQLException erro){
                //JOptionPane.showMessageDialog(null, erro.getMessage());
                return -1;
            }  
    }
    
    public Boolean VerificarEstoque(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "Select Produto, Preco, Quantidade from Estoque where Codigo = ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusdto.getCodigoProduto());   
            
            ResultSet rs = pstm.executeQuery();
            UsuarioDTO ObjusuarioDTO = new UsuarioDTO();
            if (rs.next()){
                if (rs.getInt("Quantidade") >= ObjusuarioDTO.getQuantidadeProduto()){
                    ObjusuarioDTO.setProdutoProduto(rs.getString("Produto"));
                    ObjusuarioDTO.setPrecoProduto(rs.getDouble("Preco"));        
                    return true; 
                }else{
                   JOptionPane.showMessageDialog(null, "ERRO: Quantidade indisponível no estoque."); 
                }   
            }
        }catch (SQLException erro) {
            //JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return false;
    }
}
