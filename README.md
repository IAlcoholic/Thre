_我的打包工具_
**mvn install**

mvn clean package


### qq回调地址ajax请求
``` javascript
<script type="text/javascript">

// http://scxubo.me/?#access_token=2E58D13BAEA6FDD40F4617DD2B56A265&expires_in=7776000 登陆成功的回掉地址

var access_token=" ";
var oauth_consumer_key=101429854;
var openid=" ";

var url= window.location.hash;

function urls(url){
        var s=url.search("=")
        var s1=url.search("&")
        return url.substring(s+1,s1);
}

alert(urls(url));
access_token=urls(url);


// https://graph.qq.com/oauth2.0/me?access_token=2E58D13BAEA6FDD40F4617DD2B56A265  获取用户的openid


 $.ajax({
      type: "GET",
      url: "https://graph.qq.com/oauth2.0/me?access_token=C80CB9D32BB3F8294AD005969C680E26&callback=jQuery223014868677277387699_1508927421125&_=1508927421126",
      dataType: "jsonp",
      success: function(data) {
         console.log(data);
      }, 
     error: function(error) {
      }
});


// https://graph.qq.com/user/get_user_info?access_token=2E58D13BAEA6FDD40F4617DD2B56A265&oauth_consumer_key=101429854&openid=22382917B1F9F42B1BB9D6940939CC62  获取用户资料
$.ajax({
     type: "POST",
     url: "https://graph.qq.com/user/get_user_info?access_token=C80CB9D32BB3F8294AD005969C680E26&oauth_consumer_keyopenid=22382917B1F9F42B1BB9D6940939CC62",
     dataType: "jsonp",
     success: function(data) {
       console.log(data);
     }, 
     error: function(error) {
    
     }
});
</script>
```