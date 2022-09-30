package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class EX3test extends FreeSpec with ChiselScalatestTester{
    "Ex3 test" in {
        test(new Operator(2,UInt(4.W))(_+_)){
            C =>
            C.io.in(0).poke(5.U)
            C.io.in(1).poke(2.U)
            C.clock.step(100)
        }
    }
}
