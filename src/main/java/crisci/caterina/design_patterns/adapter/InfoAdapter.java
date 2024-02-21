package crisci.caterina.design_patterns.adapter;

import java.util.Date;

public class InfoAdapter extends Info implements DataSource {

    public InfoAdapter(String nome, String cognome, Date dataNascita) {
        super(nome, cognome, dataNascita);

    }

    @Override
    public String getNomeCompleto() {
       return String.format("%s %s", getNome(), getCognome() );
    }

    @Override
    public int getEta() {
        return getDataNascita().compareTo(new Date());
    }
}
