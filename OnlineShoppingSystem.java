// Source code is decompiled from a .class file using FernFlower decompiler.
class Product {
   int id;
   String name;
   double price;
   int quantity;
   double rating;

   Product(int var1, String var2, double var3, int var5) {
      this.id = var1;
      this.name = var2;
      this.price = var3;
      this.quantity = var5;
      this.rating = 0.0;
   }

   public String toString() {
      int var10000 = this.id;
      return "ID: " + var10000 + " | Name: " + this.name + " | Price: Rs." + this.price + " | Quantity: " + this.quantity + " | Rating: " + String.valueOf(this.rating == 0.0 ? "No rating yet" : this.rating);
   }
}
