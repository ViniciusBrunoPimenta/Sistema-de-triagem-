@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private List<String> pacientes = new ArrayList<>();

    @PostMapping("/adicionar")
    public String adicionarPaciente(@RequestBody String nome) {
        pacientes.add(nome);
        return "Paciente " + nome + " adicionado!";
    }

    @GetMapping("/listar")
    public List<String> listarPacientes() {
        return pacientes;
    }
}
