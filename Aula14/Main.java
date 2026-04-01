package Aula14;

public class Main {
    
    public static void main(String[] args) {
        Banda banda = new Banda();
        banda.nome = "Onde Direcion";
        banda.genero = "Pop";

        Musica musica1 = new Musica();
        musica1.nome = "What makes you beautiful";

        Musica musica2 = new Musica();
        musica2.nome = "History of my life";

        Membro membro1 = new Membro();
        membro1.nome = "Harry Style";

        Membro membro2 = new Membro();
        membro2.nome = "Liam Palm";

        Empresario empresario = new Empresario();
        empresario.nome = "Staurt Little";

        banda.addEmpresario(empresario);
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);


        banda.mostraInfo();

    }
}
