class Sugar extends Cookie{

  String CookieShape;
  boolean CookieDecoration;

  Sugar() {
    CookieShape = "";
    CookieDecoration = false;

  }

  Sugar(String aCookieShape, boolean aCookieDecoration) {
    CookieShape = aCookieShape;
    CookieDecoration = aCookieDecoration;

  }

  String getCookieShape() {
    return CookieShape;
  }

  void setCookieShape(String aCookieShape) {
    CookieShape = aCookieShape;

  }

  void CutOut(String aCookieShape, int aNumofCookie) {
    CookieShape = aCookieShape;
    setNumofCookie(aNumofCookie);

    System.out.println(NumofCookie + " cookies were cut into " + CookieShape);
    //super.print();

  }

  void DecorateCookie() {
    if (Baked == true) {
      CookieDecoration = true;
      System.out.println("The cookies were decorated ");

    }

    else {
      System.out.println("Make sure to bake the cookies first ");
    }
  }




}