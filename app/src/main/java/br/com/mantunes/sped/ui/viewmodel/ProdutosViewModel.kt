package br.com.mantunes.sped.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.mantunes.sped.model.Produto
import br.com.mantunes.sped.repository.ProdutoRepository

class ProdutosViewModel(
    categoriaId: Long,
    private val repository: ProdutoRepository
) : ViewModel() {

    fun buscaTodos(categoriaId : Long): LiveData<List<Produto>> = repository.buscaTodos(categoriaId)

    fun buscaPorId(produtoId: Long): LiveData<Produto> = repository.buscaPorId(produtoId)
}
