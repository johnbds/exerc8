
public class Animal {
    private String nome;
    
    // Criando construtor
    public  Animal(String n){
        setNome(n);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
         this.nome = n;
       
    }
    public void imprime(){
        System.out.println(getNome());
    }
    public void talk(){
        
        
    }
    
}
