function copyToClipboard(str) {
  var obj=document.getElementById("hbnaclhngkhpmpgmfakaghgjbblokeeh");
  if( obj ){
    obj.value = str;
    obj.select();
    document.execCommand("copy", false, null);
  }
}
function getSeps() {

  var sep = localStorage["option_separator"];
  var sep_char = localStorage["option_separator_str"];

  if( sep == null ) return " : ";

  if( sep == "tab" ) return "\t";
  if( sep == "cr" ) return "\n";

  if( sep_char == null ) return " : ";

  return " " + sep_char + " ";

}

function copyurl() {
  chrome.tabs.getSelected(this.jstdata, function(tab) {
    copyToClipboard( tab.url );
    window.close();
  });
}
function copytitleurl() {
  chrome.tabs.getSelected(this.jstdata, function(tab) {
    if( tab.title ){
      copyToClipboard( tab.title + getSeps() + tab.url );
    } else {
      copyToClipboard( tab.url );
    }
    window.close();
  });
}
function copytitleurlshorten() {
  document.getElementById('indicator').style.visibility = 'visible'; 
  chrome.tabs.getSelected(this.jstdata, function(tab) {
    var url = tab.url;
    var     xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://goo.gl/api/url?user=toolbar@google.com&url=" + encodeURIComponent(url) + "&auth_token=" + getToken(url), false);
    xmlhttp.onload = function(){
        var object = JSON.parse(xmlhttp.responseText);
        if(object["short_url"] != undefined){
          if( tab.title ){
            copyToClipboard( tab.title + getSeps() + object["short_url"] );
          } else {
            copyToClipboard( object["short_url"] );
          }
        }
        document.getElementById('indicator').style.visibility = 'hidden'; 
        window.close();
      };
    xmlhttp.send(null);
  });
}
function copyselectiontitleshorten(selection) {
  chrome.tabs.getSelected(this.jstdata, function(tab) {
    var url = tab.url;
    var     xmlhttp = new XMLHttpRequest();
    xmlhttp.open("POST", "http://goo.gl/api/url?user=toolbar@google.com&url=" + encodeURIComponent(url) + "&auth_token=" + getToken(url), false);
    xmlhttp.onload = function(){
        var object = JSON.parse(xmlhttp.responseText);
        if(object["short_url"] != undefined){
          if( tab.title ){
            copyToClipboard( selection + getSeps() + tab.title + getSeps() + object["short_url"] );
          } else {
            copyToClipboard( selection + getSeps() + object["short_url"] );
          }
        }
      };
    xmlhttp.send(null);
  });
}
function copyurlwtag() {
  chrome.tabs.getSelected(this.jstdata,function(tab) {
    if( tab.title ){
      copyToClipboard( "<a href=\"" + tab.url + "\" >" + tab.title + "</a>" );
    } else {
      copyToClipboard( "<a href=\"" + tab.url + "\" >" + tab.url + "</a>" );
    }
    window.close();
  });
}
