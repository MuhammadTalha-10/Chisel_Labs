package LAB1
import chisel3._

class countcast(size: Int, maxValue:SInt) extends Module{
    val io = IO(new Bundle{
        val result = Output(Bool())
    })
    def gencounter(n: Int, max: SInt) = {
        val count = RegInit(0.S (4.W))
        when (count === max){
            count := 0.S
        }.otherwise {
            count := count + 1.S
        }
        count
    } 
    val counter1 = gencounter(size , maxValue)
    io.result := counter1(size - 1)
}