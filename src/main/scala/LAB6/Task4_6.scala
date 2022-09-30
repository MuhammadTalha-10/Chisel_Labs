package LAB6
import chisel3 . _
import chisel3 . util . _
class up_down_counter2 ( val max : Int = 10) extends Module {
    val io = IO (new Bundle {
    val out = Output ( UInt ( log2Ceil ( max ) . W ) )
    val up_down = Input(Bool())
})
    io.out := 0.U
    val count = RegInit(0.U(log2Ceil(max)))
    when((io.up_down === 1.B) && (count =/=(max.U - 1.U))){
        count := count + 1.U
    }.elsewhen((io.up_down === 0.B) || (count =/= 0.U)){
        count := count - 1.U
    }
    io.out := count
}
