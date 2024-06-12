

public class ControllerDeputados {
    private crud crud;

     public ControllerDeputados(){
        this.crud= new crud();
    }


    public void AdicionarDp(int id,String nome, String email){
        crud.adicionar(id, nome, partido);
    }


    public void DeletarDp (int id){
        crud.deletar(id);
    }


}
