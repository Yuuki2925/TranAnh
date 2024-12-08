let product_arr = [];

// Hàm hiển thị sản phẩm
function Show() {
    let output = "";
    for (let i = 0; i < product_arr.length; i++) {
        output += `
            <li type="1">
                ${product_arr[i]}
                <span>
                    <button type="submit" id="btn_edit" onclick="EditProduct(${i})">Edit</button>
                    <button type="submit" id ="btn_delete" onclick="DeleteProduct(${i})">Delete</button>
                </span>
            </li>
        `;
    }
    document.getElementById("show").innerHTML = output;
}


// Ham them san pham
function addProduct() {
    let add_product = document.getElementById("product").value.trim();
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
function EditProduct(index) {
    let editName = prompt("Nhập tên mới: ");
    while (editName === "") {
        editName = prompt("Không hợp lệ. Vui lòng nhập lại tên mới: ");
    }
    product_arr[index] = editName;
    Show();
}

// Ham xoa san pham
function DeleteProduct(index) {
    let check = confirm("Bạn có chắc chắn muốn xóa sản phẩm không?");
    if (check) {
        product_arr.splice(index, 1);
    }
    Show();
}
