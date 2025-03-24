package br.com.alura.minhasmusicas;


public class MinhasPreferidas {

    public void inclui(Audio audio) {

        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido ");
        } else {
            System.out.println(audio.getTitulo() + " não é considerado um sucesso,mas é bom ");
        }
    }
}


