package Utilitários;
import Utilitários.ConexaoBD;
import Utilitários.ConexaoBD;
import Utilitários.UsuarioDTO;
import Utilitários.UsuarioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class ConexaoCi {
    Connection conn;
    
    public int AutenticarFuncionario(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();
        try{
            String sql = "Insert into Funcionarios (CPF, Nome, Usuario, Senha, DataNascimento, Funcao, Sexo) Values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusdto.getCPF());
            pstm.setString(2, objusdto.getNomeFuncionario());
            pstm.setString(3, objusdto.getUsuario());
            pstm.setString(4, objusdto.getSenha());
            pstm.setString(5, objusdto.getFuncao());
            pstm.setString(6, objusdto.getDataNascimento());
            pstm.setString(7, objusdto.getSexo());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){
            return -1;
        }
    }
    
    public int AutenticarEstoque(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();
        try{
            String sql = "Insert into Estoque (Codigo, Tamanho, Quantidade, Preco, Nome) Values (?, ?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusdto.getCodigo());
            pstm.setString(2, objusdto.getTamanho());
            pstm.setInt(3, objusdto.getQuantidade());
            pstm.setDouble(4, objusdto.getPreco());
            pstm.setString(5, objusdto.getNomeProduto());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){                
            return -1;
        }
    }
    
    public int AutenticarRegistro(UsuarioDTO objusdto){
        conn = new ConexaoBD().ConectaBD();       
        try{
            String sql = "Insert into Registro (Data, Cliente, Telefone, CPF, Produto, Tamanho, Quantidade, Total) Values (?, ?, ?, ?, ?, ?, ?, ?)";
            LocalDate dataAtual = LocalDate.now();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setObject(1, dataAtual);
            pstm.setString(2, objusdto.getCliente());
            pstm.setString(3, objusdto.getTelefone());
            pstm.setString(4, objusdto.getCPFCliente());
            pstm.setString(5, objusdto.getProduto());
            pstm.setString(6, objusdto.getTamanhoProduto());
            pstm.setInt(7, objusdto.getQuantidadeProduto());
            pstm.setDouble(8, objusdto.getTotal());
            
            int rs = pstm.executeUpdate();
            return rs;
        }catch (SQLException erro){    
            return -1;
        }
    }
}
