# Write your MySQL query statement below 
SELECT product_id FROM Products
WHERE (low_fats = "Y") AND (recyclable = "Y")
group by product_id;