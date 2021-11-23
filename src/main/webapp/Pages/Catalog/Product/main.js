function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        var ImgString = '';

        reader.onload = function (e) {
            $('#imageResult')
                .attr('src', e.target.result);
                ImgString = e.target.result;
                document.getElementById("data_url").value = ImgString;
        };
        reader.readAsDataURL(input.files[0]);
    }
}

$(function () {
    $('#upload').on('change', function () {
        readURL(input);
    });
});


var input = document.getElementById( 'upload' );
var infoArea = document.getElementById( 'upload-label' );

input.addEventListener( 'change', showFileName );
function showFileName( event ) {
  var input = event.srcElement;
  var fileName = input.files[0].name;
  infoArea.textContent = 'File name: ' + fileName;
}