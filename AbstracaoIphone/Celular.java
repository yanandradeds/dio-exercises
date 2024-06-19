package AbstracaoIphone;

public class Celular implements NavegarInternet,ReprodutorMidia,Telefonia{

    @Override
    public void carregarPagina(String URL) {
        System.out.println("Carregando página...");
    }

    @Override
    public void trocarParaPaginaClicada() {
        System.out.println("Trocando página...");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltar pagina...");
    }

    @Override
    public void gravar() {
        System.out.println("Gravando");
    }

    @Override
    public void reproduzirMidia() {
        System.out.println("Reproduzino musica/video");
    }

    @Override
    public void visualizarMusicas() {
        System.out.println("Lista de musica");
    }

    @Override
    public void visualizarVideos() {
        System.out.println("Lista de videos");
    }

    @Override
    public void ligar() {
        System.out.println("ligando...");
    }

    @Override
    public void atender() {
        System.out.println("atender...");
    }

    @Override
    public void enviarSMS() {
        System.out.println("enviando sms...");
    }

    @Override
    public void ligarEmGrupo() {
        System.out.println("Ligacao em grupo");
    }
}
