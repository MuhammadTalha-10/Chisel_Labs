package LAB1
import chisel3._
import org.scalatest._
import chiseltest._

class utostest extends FreeSpec with ChiselScalatestTester{
    "utos test" in{
        test(new u_to_s(1.U)){
            C =>
            C.clock.step(100)
            // C.io.result.expect(1.B)
        }
    }
}