$(document).ready(function () {
  $(".price_product").mask("#.##0,00", { reverse: true });
});

function validate() {
  var productPrice = $(".price_product");
  var productName = $("#product_name");
  var error_div = $(".error_div");
  var error_span = $(".error_span");

  if (productName.val().length == 0 || productPrice.val().length == 0) {
    error_div.css("visibility", "visible");
    error_span.text("Preencha todos os campos.");
    return false;
  } else {
    error_div.css("visibility", "hidden");
    return true;
  }
}
