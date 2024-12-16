package src.iphone;

public class iPhone {

    private final ReprodutorMusical reprodutorMusical;
    private final AparelhoTelefonico aparelhoTelefonico;
    private final NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.tocar();
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.ligar("123456789");
    }

    public void usarNavegadorInternet() {
        navegadorInternet.exibirPagina("www.example.com");
    }

}

