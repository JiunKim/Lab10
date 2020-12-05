class Cookie {
  public int NumofCookie;
  public int BakeTemp;
  public int BakeTime;
  public boolean Baked;

  Cookie() {
    NumofCookie = 0;
    BakeTemp = 0;
    BakeTime = 0;
    Baked = false;

  }

  Cookie(int aNumofCookie, int aBakeTemp, int aBakeTime, boolean aBaked){
    NumofCookie = aNumofCookie;
    BakeTemp = aBakeTemp;
    BakeTime = aBakeTime;
    Baked = aBaked;

  }

  boolean getisReady() {
    return Baked;
  }

  void setNumofCookie(int aNumofCookie) {
    NumofCookie = aNumofCookie;
  }

  void CookieBaked(int aBakeTemp, int aBakeTime) {
    BakeTemp = aBakeTemp;
    BakeTime = aBakeTime;
    Baked = true;

    System.out.println(NumofCookie + " cookies were baked at " + aBakeTemp +  " degrees F for " + aBakeTime +  " minutes ");

  }



}

