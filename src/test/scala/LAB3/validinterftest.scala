/*package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class Valid_Interftest extends FreeSpec with ChiselScalatestTester{
    "Valid interface test" in{
        test(new decoder_with_valid){
            C =>
            C.io.in.poke("b01".U)
            C.clock.step(100)
        }
    }
}
*/
