package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class AdderTest extends FreeSpec with ChiselScalatestTester{
    "Adder test" in{
        test(new Adder(3)){
            C =>
            C.io.in0.poke(2.U)
            C.io.in1.poke(3.U)
            C.clock.step(100)
            C.io.sum.expect(5.U)
        }
    }
}