/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilitários;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno.Tarde
 */
public class UsuarioDTO {
    //Cadastrar funcionário
    private String FuncaoFuncionario;
    private String NomeFuncionario;
    private String CPFFuncionario;
    private String DataNascimentoFuncionario;
    private String SexoFuncionario;
    private String UsuarioFuncionario;
    private String SenhaFuncionario;
    private int CodigoFuncionario;
    
    //Adicionar produto ao estoque
    private String ProdutoEstoque;
    private String TamanhoEstoque;
    private int QuantidadeEstoque;
    private Double PrecoEstoque;
    private int CodigoEstoque;
    
    //Registrar vendas
    private String ClienteRegistro;
    private String TelefoneRegistro;
    private String CPFRegistro;
    private String ProdutoRegistro;
    private String TamanhoRegistro;
    private int QuantidadeRegistro;
    private Double TotalRegistro;
    private int NotaFiscalRegistro;
    
    //Verificar produto no estoque
    private int CodigoProduto;
    private String ProdutoProduto;
    private Double PrecoProduto;
    private int QuantidadeProduto;
    
    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        if (!NomeFuncionario.isEmpty()){
            this.NomeFuncionario = NomeFuncionario;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do funcionário.");
        }
    }


    public String getUsuarioFuncionario() {
        return UsuarioFuncionario;
    }

    public void setUsuarioFuncionario(String UsuarioFuncionario) {
        if (!UsuarioFuncionario.isEmpty()){
            this.UsuarioFuncionario = UsuarioFuncionario;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o Usuario do funcionário.");
        }
    }


    public String getSenhaFuncionario() {
        return SenhaFuncionario;
    }

    public void setSenhaFuncionario(String SenhaFuncionario) {
        if (!SenhaFuncionario.isEmpty()){
            this.SenhaFuncionario = SenhaFuncionario;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique a senha do funcionário.");
        }
    }


    public String getCPFFuncionario() {
        return CPFFuncionario;
    }

    public void setCPFFuncionario(String CPFFuncionario) {
        if (!CPFFuncionario.equals("   .   .   -  ")){
            this.CPFFuncionario = CPFFuncionario;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o Cpf do funcionário.");
        }
    }


    public String getDataNascimentoFuncionario() {
        return DataNascimentoFuncionario;
    }

    public void setDataNascimentoFuncionario(String DataNascimentoFuncionario) {
        if (!DataNascimentoFuncionario.equals("  /  /    ")){         
            this.DataNascimentoFuncionario = DataNascimentoFuncionario;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique a data de nascimento do funcionário.");
        }
    }


    public String getFuncaoFuncionario() {
        return FuncaoFuncionario;
    }

    public void setFuncaoFuncionario(String FuncaoFuncionario) {
        if (!FuncaoFuncionario.isEmpty()){
            this.FuncaoFuncionario = FuncaoFuncionario;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique a função do funcionário.");
        }
    }


    public String getSexoFuncionario() {
        return SexoFuncionario;
    }

    public void setSexoFuncionario(String SexoFuncionario) {
            this.SexoFuncionario = SexoFuncionario;
    }


    public String getProdutoEstoque() {
        return ProdutoEstoque;
    }

    public void setProdutoEstoque(String ProdutoEstoque) {
        if (!ProdutoEstoque.isEmpty()){
            this.ProdutoEstoque = ProdutoEstoque;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o nome do produto.");
        }
    }


    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(int QuantidadeEstoque) {
        if (QuantidadeEstoque > 0){
            this.QuantidadeEstoque = QuantidadeEstoque;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: A quantidade deve ser maior do que zero.");
        }
    }


    public Double getPrecoEstoque() {
        return PrecoEstoque;
    }

    public void setPrecoEstoque(Double PrecoEstoque) {
        if (PrecoEstoque > 0){
            this.PrecoEstoque = PrecoEstoque;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: O preço deve ser maior do que zero.");
        }
    }


    public String getTamanhoEstoque() {
        return TamanhoEstoque;
    }

    public void setTamanhoEstoque(String TamanhoEstoque) {
        this.TamanhoEstoque = TamanhoEstoque;
    }


    public String getClienteRegistro() {
        return ClienteRegistro;
    }

    public void setClienteRegistro(String ClienteRegistro) {
        this.ClienteRegistro = ClienteRegistro;
    }


    public String getTelefoneRegistro() {
        return TelefoneRegistro;
    }

    public void setTelefoneRegistro(String TelefoneRegistro) {
        this.TelefoneRegistro = TelefoneRegistro;
    }


    public String getCPFRegistro() {
        return CPFRegistro;
    }

    public void setCPFRegistro(String CPFRegistro) {
        this.CPFRegistro = CPFRegistro;
    }


    public String getProdutoRegistro() {
        return ProdutoRegistro;
    }

    public void setProdutoRegistro(String ProdutoRegistro) {
        this.ProdutoRegistro = ProdutoRegistro;
    }


    public String getTamanhoRegistro() {
        return TamanhoRegistro;
    }

    public void setTamanhoRegistro(String TamanhoRegistro) {
        this.TamanhoRegistro = TamanhoRegistro;
    }


    public int getQuantidadeRegistro() {
        return QuantidadeRegistro;
    }

    public void setQuantidadeRegistro(int QuantidadeRegistro) {
        this.QuantidadeRegistro = QuantidadeRegistro;
    }


    public Double getTotalRegistro() {
        return TotalRegistro;
    }

    public void setTotalRegistro(Double TotalRegistro) {
        this.TotalRegistro = TotalRegistro;
    }


    public int getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(int CodigoProduto) {
        if (!String.valueOf(CodigoProduto).isEmpty()){
            this.CodigoProduto = CodigoProduto;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Verifique o código do produto.");
        }
     
    }

    public String getProdutoProduto() {
        return ProdutoProduto;
    }

    public void setProdutoProduto(String ProdutoProduto) {
        this.ProdutoProduto = ProdutoProduto;
    }

    public Double getPrecoProduto() {
        return PrecoProduto;
    }

    public void setPrecoProduto(Double PrecoProduto) {
        this.PrecoProduto = PrecoProduto;
    }

    public int getCodigoEstoque() {
        return CodigoEstoque;
    }

    public void setCodigoEstoque(int CodigoEstoque) {
        this.CodigoEstoque = CodigoEstoque;
    }

    public int getCodigoFuncionario() {
        return CodigoFuncionario;
    }

    public void setCodigoFuncionario(int CodigoFuncionario) {
        this.CodigoFuncionario = CodigoFuncionario;
    }

    public int getQuantidadeProduto() {
        return QuantidadeProduto;
    }

    public void setQuantidadeProduto(int QuantidadeProduto) {
        if (QuantidadeProduto > 0){
            this.QuantidadeProduto = QuantidadeProduto;
        }else{
            JOptionPane.showMessageDialog(null, "ERRO: A quantidade deve ser maior do que zero.");
        }
    }

    public int getNotaFiscalRegistro() {
        return NotaFiscalRegistro;
    }

    public void setNotaFiscalRegistro(int NotaFiscalRegistro) {
        this.NotaFiscalRegistro = NotaFiscalRegistro;
    }
}
