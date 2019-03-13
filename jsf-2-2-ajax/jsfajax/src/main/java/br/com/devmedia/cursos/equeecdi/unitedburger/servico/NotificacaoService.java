package br.com.devmedia.cursos.equeecdi.unitedburger.servico;

import br.com.devmedia.cursos.equeecdi.unitedburger.domain.dao.NotificacaoDao;
import br.com.devmedia.cursos.equeecdi.unitedburger.domain.model.Notificacao;

public class NotificacaoService {

    private NotificacaoDao notificacaoDao = new NotificacaoDao();

    public void cadastrar(Notificacao notificacao) {
        notificacaoDao.cadastrar(notificacao);
    }

}
