package com.br.gfelix.App.step;

import com.br.gfelix.App.entity.Transacao;
import com.br.gfelix.App.repository.TransacaoRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DBItemWriter implements ItemWriter<Transacao> {

    @Autowired
    TransacaoRepository transacaoRepository;

    @Override
    public void write(List<? extends Transacao> listTransacoes) throws Exception {
        System.out.println("Data Saved for Employees: " + listTransacoes);
        transacaoRepository.saveAll(listTransacoes);
    }
}