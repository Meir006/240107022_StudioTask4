Name:Turgunbay Meiirbek
student ID: 240107022

Programming language; Java

How to run the test: Run Test class that located in the main src directory

Explanation:
the original problem:
PaymentPort and CampusCardTerminal are incompatible: pay(studentId, tenge) returns a boolean,
while charge(cardNumber, usd) returns an int code. We cannot change the terminal code.
We have to convert Terminal things to Payment port.
Which means that make them compatible with each other.

the main roles in your pattern:
For this purpose we use adapter. Which will be kind of a bridge between them. It will convert tenge to dollar and studentId to CardNumber by funding hasCode of it.
It also converts 0 from terminal to true in paymentPort.

The main roles in your pattern

PaymentPort is the interface that checkout uses. CampusCardTerminal is the vendor API that we cannot edit. CampusCardAdapter implements PaymentPort, converts KZT to USD and turns result 0 into true.

How the pattern improves the design

Checkout calls only pay() and does not know the terminal API. All conversion is in one class, so checkout stays unchanged and a vendor change affects only the adapter.


