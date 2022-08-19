package br.com.mantunes.sped.ui.viewmodel

import androidx.lifecycle.ViewModel
import br.com.mantunes.sped.model.Pagamento
import br.com.mantunes.sped.repository.PagamentoRepository
import br.com.mantunes.sped.repository.ProdutoRepository

class PagamentoViewModel(

    private val pagamentoRepository: PagamentoRepository
) : ViewModel() {
    fun salva(pagamento: Pagamento) =
        pagamentoRepository.salva(pagamento)
}