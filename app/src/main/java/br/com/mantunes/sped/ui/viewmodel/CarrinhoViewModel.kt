package br.com.mantunes.sped.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.mantunes.sped.model.Carrinho
import br.com.mantunes.sped.repository.CarrinhoRepository

class CarrinhoViewModel(
    private val clienteId: Long,
    private val carrinhoRepository: CarrinhoRepository
) : ViewModel() {

    fun inclui(carrinho: Carrinho) =
        carrinhoRepository.inclui(carrinho)

    fun salva(carrinho: Carrinho) =
        carrinhoRepository.salva(carrinho)

    fun deleta(carrinho: Carrinho) =
        carrinhoRepository.delete(carrinho)

    fun buscaTodos(clienteId: Long): LiveData<List<Carrinho>> {
        return carrinhoRepository.buscaTodos(clienteId)
    }
}