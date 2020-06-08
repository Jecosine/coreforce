import requests
from bs4 import BeautifulSoup as bs

header = {

}

sina_link = ["http://sports.sina.com.cn/","http://finance.sina.com.cn/","http://ent.sina.com.cn/", "http://tech.sina.com.cn/", "http://edu.sina.com.cn/"]
cate_list = ["体育","财经","娱乐","科技","教育"]

def get_link(cate):
  res = requests.get
