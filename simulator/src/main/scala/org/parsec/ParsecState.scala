package org.parsec

import org.parsec.ParsecProtocol._

/**
  * For each address - keep the balance and history of recent
  * [ rolling window - 5 min ] + [ most recent transaction]
  *
  */
object ParsecState {

  val DB = List(
    AddressBalance("address1", 0.011),
    AddressBalance("address2", 0.004)
  )

  def submitTransaction(signedInvoice: SignedInvoice): Either[Boolean, String] = {
    assert(validateTransaction(), "Invalid transaction")
    //Right("Transaction rejected for reason : X")
    Left(true)
  }

  private def validateTransaction(): Boolean = true

}

// This class is used only internally in this file
case class AddressBalance(address: String, balance: Double)
