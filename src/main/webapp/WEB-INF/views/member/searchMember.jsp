<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원검색</title>
</head>
<style>
	.search{
		width:800px;
		margin:0 auto;
	}
	.search h1{
		text-align: center;
		margin-bottom: 30px;
	}
	select{
		width: 100px;
		height: 35px;
		margin-left: 100px;
	}
	.searchbar{
		width:400px;
		height: 30px;
	}
	.submit{
		width: 80px;
		height: 35px;
	}	
</style>

<body>
	<div class="search">
		<h1>직원 검색</h1>
		<!-- onsubmit: form태그안에 form전송하기전에 데이터 유효성을 체크하기 위한 이벤트 -->
        <form action="actionSearchMember.do" method="post" onsubmit="return check(this);">
            <select name="searchKeyWordTypeCode">
                <option value="name">이름</option>
                <option value="address">주소</option>
                <option value="email">이메일</option>
                <option value="tel">전화번호</option>
            </select>
            <input class="searchbar" type="text" name = "searchKeyWord" placeholder="검색어를 입력해주세요" required="required">
            <input class="submit" type="submit" value="검색"> 
        </form>
    </div>
    <script>    
    	function check(form){
    		// 검색어 좌우 공백제거
	    	form.searchKeyWord.value = form.searchKeyWord.value.trim();
	    	
	    	if(form.searchKeyWord.value.length == 0){
	    		alert("검색어를 입력해주세요");
	    		return false;
	    	}  
	    	
	    	return true;
    	}	
    </script>
</body>
</html>