let Product = [];

// Hàm thêm sản phẩm
function Addproduct() {
    let names = document.getElementById("Newproduct").value;
    if (names.trim() !== "") {
        Product.push(names);
        document.getElementById("Newproduct").value = "";
        DisplayProducts();
    } else {
        alert("Vui lòng nhập tên sản phẩm!");
    }
}

// Hàm hiển thị danh sách sản phẩm
function DisplayProducts() {
    let Ketqua = document.getElementById("Kq");
    Ketqua.innerHTML = "";

    for (let i = 0; i < Product.length; i++) {
        let listItem = document.createElement("li");

        // Số thứ tự và tên sản phẩm
        let productName = document.createElement("span");
        productName.className = "product-name";
        productName.textContent = (i + 1) + ". " + Product[i];

        // Nút sửa
        let editButton = document.createElement("button");
        editButton.textContent = "Sửa";
        editButton.onclick = function () {
            EditProduct(i);
        };

        // Nút xóa
        let deleteButton = document.createElement("button");
        deleteButton.textContent = "Xóa";
        deleteButton.onclick = function () {
            DeleteProduct(i);
        };

        // Thêm các thành phần vào mục danh sách
        listItem.appendChild(productName);
        listItem.appendChild(editButton);
        listItem.appendChild(deleteButton);
        Ketqua.appendChild(listItem);
    }
}


// Hàm sửa sản phẩm
function EditProduct(index) {
    let newName = prompt("Nhập tên mới cho sản phẩm:", Product[index]);
    if (newName !== null && newName.trim() !== "") {
        Product[index] = newName;
        DisplayProducts();
    } else {
        alert("Tên sản phẩm không được để trống!");
    }
}

// Hàm xóa sản phẩm
function DeleteProduct(index) {
    if (confirm("Bạn có chắc chắn muốn xóa sản phẩm này?")) {
        Product.splice(index, 1);
        DisplayProducts();
    }
}
