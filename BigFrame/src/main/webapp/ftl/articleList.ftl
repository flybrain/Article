<html>
  <head>
    <title>article list</title>
  </head>
  
  <body>
  <a href="addShow.do">添加</a><br/><br/><a href="list/json.do">以json方式查看列表</a><br/><br/>
    <#list articles as article>    
    <a href="show.do?id=${article.id}">${article.title}</a>-<a href="delete.do?id=${article.id}">删除</a>-<a href="show/json.do?id=${article.id}">json</a><br />
    </#list>
  </body>
</html>
