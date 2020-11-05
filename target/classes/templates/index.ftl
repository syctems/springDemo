<#assign base=springMacroRequestContext.contextPath />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="${base}/static/my.css" rel="stylesheet">
    <script src="${base}/static/my.js"></script>
</head>

<#list userList as user>
    <ul>
        <li>${user.id}</li>
        <li>${user.name}</li>
    </ul>
</#list>
</body>
</html>