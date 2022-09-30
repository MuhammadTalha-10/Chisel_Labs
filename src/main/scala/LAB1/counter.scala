package LAB1
import chisel3._


class Counter(counterBits: UInt) extends Module{
  val io = IO(new Bundle {
    val result = Output(Bool())
  })
val max = (1.U << counterBits) - 1.U
val count = RegInit(0.U(5.W))
when (count === count-1.U){
  count := 0.U
}.otherwise {
  count := count + 1.U
}
io.result := count(4.U)
when (io.result === 1.B){
  count := 0.U
}
println(s"counter created with max valye $max")
}
