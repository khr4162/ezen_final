const smallBox1 = document.getElementById("smallBox1");
const smallBox2 = document.getElementById("smallBox2");
const smallBox3 = document.getElementById("smallBox3");
const smallBox4 = document.getElementById("smallBox4");
const tvBox = document.getElementById("tvBox");
const internetBox = document.getElementById("internetBox");
const rentalBox = document.getElementById("rentalBox");
const telBox = document.getElementById("telBox");

smallBox1.addEventListener("click", function () {
  tvBox.style.display = "block";
  internetBox.style.display = "none";
  rentalBox.style.display = "none";
  telBox.style.display = "none";
  smallBox1.style.backgroundColor = "orangered";
  smallBox2.style.backgroundColor = "white";
  smallBox3.style.backgroundColor = "white";
  smallBox4.style.backgroundColor = "white";
  smallBox1.style.color = "white";
  smallBox2.style.color = "black";
  smallBox3.style.color = "black";
  smallBox4.style.color = "black";
});
smallBox2.addEventListener("click", function () {
  tvBox.style.display = "none";
  internetBox.style.display = "block";
  rentalBox.style.display = "none";
  telBox.style.display = "none";
  smallBox1.style.backgroundColor = "white";
  smallBox2.style.backgroundColor = "orangered";
  smallBox3.style.backgroundColor = "white";
  smallBox4.style.backgroundColor = "white";
  smallBox1.style.color = "black";
  smallBox2.style.color = "white";
  smallBox3.style.color = "black";
  smallBox4.style.color = "black";
});
smallBox3.addEventListener("click", function () {
  tvBox.style.display = "none";
  internetBox.style.display = "none";
  rentalBox.style.display = "block";
  telBox.style.display = "none";
  smallBox1.style.backgroundColor = "white";
  smallBox2.style.backgroundColor = "white";
  smallBox3.style.backgroundColor = "orangered";
  smallBox4.style.backgroundColor = "white";
  smallBox1.style.color = "black";
  smallBox2.style.color = "black";
  smallBox3.style.color = "white";
  smallBox4.style.color = "black";
});
smallBox4.addEventListener("click", function () {
  tvBox.style.display = "none";
  internetBox.style.display = "none";
  rentalBox.style.display = "none";
  telBox.style.display = "block";
  smallBox1.style.backgroundColor = "white";
  smallBox2.style.backgroundColor = "white";
  smallBox3.style.backgroundColor = "white";
  smallBox4.style.backgroundColor = "orangered";
  smallBox1.style.color = "black";
  smallBox2.style.color = "black";
  smallBox3.style.color = "black";
  smallBox4.style.color = "white";
});