
package Cadastro;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
/**
 *
 * @author Saulo
 */

@Entity
@Table(name = "cliente")
public class CadastroCliente{
    
    @Id
    @GeneratedValue
    
    @Column(name = "id_cliente")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "historico")
    private String historico;
    @Column(name = "nome_conjugue")
    private String nomeConjugue;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @Column(name = "data_inicio")
    private Date dataInicio;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getHistorico(){
        return historico;
    }
    public void setHistorico(String historico){
        this.historico = historico;
    }
    public String getNomeConjugue(){
        return nomeConjugue;
    }
    public void setNomeConjugue(String nomeConjugue){
        this.nomeConjugue = nomeConjugue;
    }
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public Date getDataInicio(){
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio){
        this.dataInicio = dataInicio;
    }
}