package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class ex3_decoupletest extends FreeSpec with ChiselScalatestTester{
    "decouple test" in{
        test(new My_Queue){
            C =>
            C.io.in.valid.poke(1.B)
            C.io.in.bits.poke(3.U)
            C.clock.step(100)
            C.io.out.ready.poke(1.B)

        }
    }
}