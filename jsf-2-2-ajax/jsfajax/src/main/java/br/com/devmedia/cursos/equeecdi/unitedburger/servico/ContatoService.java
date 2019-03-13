package br.com.devmedia.cursos.equeecdi.unitedburger.servico;

import br.com.devmedia.cursos.equeecdi.unitedburger.domain.dao.ContatoDao;
import br.com.devmedia.cursos.equeecdi.unitedburger.domain.model.Contato;

public class ContatoService {

    private ContatoDao contatoDao = new ContatoDao();

    public void cadastrar(Contato contato) {
        contatoDao.cadastrar(contato);
    }

}
