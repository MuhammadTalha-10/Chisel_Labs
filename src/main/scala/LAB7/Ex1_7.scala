package LAB7

import chisel3._
import chisel3.util._




class arbiter extends Module{
    val io = IO(new Bundle {
    val producer0 = Flipped(Decoupled(UInt(8.W)))
    val producer1 = Flipped(Decoupled(UInt(8.W)))
    val producer2 = Flipped(Decoupled(UInt(8.W)))
    val out = Decoupled(UInt(4.W))
})
    io.producer0.ready := 1.B
    io.producer1.ready := 1.B
    io.producer2.ready := 1.B

    val queue1 = Queue(io.producer0,3)
    val queue2 = Queue(io.producer1,3)
    val queue3 = Queue(io.producer2,3)
    

    val arb_priority = Module (new Arbiter (UInt() , 3))
    arb_priority.io.in(0) <> queue1
    arb_priority.io.in(1) <> queue2
    arb_priority.io.in(2) <> queue3
    io.out <> arb_priority.io.out
}
