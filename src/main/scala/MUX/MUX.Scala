package MUX
import chisel3._
class MUX extends Module{
    val io = IO(new Bundle{
        val inp1 = Input(UInt(1.W))
        val inp2 = Input(UInt(1.W))
        val out = Output(UInt(1.W))
        val selc = Input(UInt(3.W))
    })
when(io.selc === 0.U){
    io.out := io.inp1 + io.inp2 
}.elsewhen(io.selc === 1.U){
    io.out := io.inp1 - io.inp2
}.elsewhen(io.selc === 2.U){
    io.out := io.inp1 & io.inp2
}.elsewhen(io.selc === 3.U){
    io.out := io.inp1 | io.inp2
}.elsewhen(io.selc === 4.U){
    io.out := io.inp1 ^ io.inp2
}.otherwise{
    io.out := 0.U
}

}

