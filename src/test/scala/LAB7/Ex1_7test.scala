package LAB7

import chisel3._
import org.scalatest._
import chiseltest._

class ArbiterQtest extends FreeSpec with ChiselScalatestTester{
    "ArbiterQ test" in{
        test(new arbiter){
            C =>
            C.io.producer0.valid.poke(1.B)
            C.io.producer0.bits.poke(2.U)
            C.io.producer1.valid.poke(1.B)
            C.io.producer1.bits.poke(4.U)
            C.io.producer2.valid.poke(1.B)
            C.io.producer2.bits.poke(6.U)
            C.io.out.ready.poke(1.B)
            C.clock.step(100)
        }
    }
}