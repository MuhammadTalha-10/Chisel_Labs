package LAB1
import chisel3._
import org.scalatest._
import chiseltest._

class countertests extends FreeSpec with ChiselScalatestTester{
    "counter test" in {
        test(new Counter(5.U)){
            C =>
            C.clock.step(100)
            // C.io.result.expect(0.B)
        }
    }
}
