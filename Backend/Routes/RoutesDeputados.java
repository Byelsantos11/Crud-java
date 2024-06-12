import org.springframework.web.bind.annotation.*;

public class RouteDeputados {
    private ControllerDeputados controller;

    public RouteDeputados() {
        this.controller = new ControllerDeputados();
    }

    @PostMapping("/deputados/adicionar")
    public void adicionarDeputado(@RequestParam int id, @RequestParam String nome, @RequestParam String email) {
        controller.adicionar(id, nome, email);
    }

    @DeleteMapping("/deputados/{id}")
    public void deletarDeputado(@PathVariable int id) {
        controller.deletar(id);
    }
}
