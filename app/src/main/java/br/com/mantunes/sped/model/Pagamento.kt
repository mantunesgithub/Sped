package br.com.mantunes.sped.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import br.com.mantunes.sped.model.enum.ESTADO_PAGAMENTO
import br.com.mantunes.sped.model.enum.TIPO_PAGAMENTO
import java.math.BigDecimal
@Entity(
    foreignKeys = [ForeignKey(
        entity = Pagamento::class,
        parentColumns = ["id"],
        childColumns = ["idPedido"]
    )],
    indices = [Index("idPedido")]
)
data class Pagamento(
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var tipoPagamento: TIPO_PAGAMENTO,
    var estadoPagamento: ESTADO_PAGAMENTO,
    var numeroCartao: Long,
    var dataValidadeCartao: String,
    var cvcCartao: Int,
    var numeroParcelasCartao: Int,
    var dataVencimentoBoleto: String,
    var chavePix: String,
    var idPedido: Long
)