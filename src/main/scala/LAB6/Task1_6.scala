package LAB6
import chisel3 . _
import chisel3 . util . _
class counter_with_xor(val width : Int) extends Module {
    val io = IO (new Bundle {
    val out = Output (UInt((width.W)))
    })
    val count = RegInit(0.U(width.W))
    when((count(width-1) ^ 1.U) === 1.U){
        count := count + 1.U
    }.otherwise{
        count := 0.U
    }
    io.out := count
}