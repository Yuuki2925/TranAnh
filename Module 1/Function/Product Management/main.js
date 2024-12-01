let product_arr = [];

// Hàm hiển thị sản phẩm
function Show() {
    let output = "";  // Biến này sẽ lưu nội dung các sản phẩm
    for (let i = 0; i < product_arr.length; i++) {
        output += `
            <li type="1">
                ${product_arr[i]}
                <span>
                    <button type="submit" onclick="EditProduct(${i})">Edit</button>
                    <button type="submit" onclick="DeleteProduct(${i})">Delete</button>
                </span>
            </li>
        `;
    }
    document.getElementById("show").innerHTML = output;
}


// Ham them san pham
function addProduct() {
    let add_product = document.getElementById("product").value;
    if (add_product) {
        product_arr.push(add_product);
        document.getElementById("product").value = "";
        Show();
        alert(`Sản phẩm "${add_product}" đã được thêm vào.`);
    } else {
        alert("Vui lòng nhập sản phẩm!");
    }
}

// Ham chinh sua ten san pham
function EditProduct(){

}

// Ham xoa san pham
function DeleteProduct(){

}
