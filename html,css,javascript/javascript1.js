/* let age=18;
if(age>18)
{
    console.log("eligible to vote");
}else{
    console.log(" not eligible to vote");
} */


/* const person={
    name:"ranju",age:22,};
    for(let key in person){
        console.log(key,person[key]);
    }
 */

    /* const person=["ranju",22,"jam"];
        for(let key of person){
            console.log(key);
        } */


        /* Finding prime Number */

        /* function prime(n){
            for(let i=2;i<=n;i++){
                count=0;
                for(let j=2;j<=i/2;j++){
                    if(i%j==0){
                        count++;
                        break;
                    }
                    }
                    if(count==0){
                    console.log(i);
                    }
                }
            }
            prime(9);

 */

//adding elements
        /* const number=[1,2,3];
        number.push(5,6);
        console.log(number); */
        
        // two number sum

        function demo(array,targetsum,n){
        for(let i=0;i<n;i++)
        for(let j=i+1;j<n;j++)
        if(array[i]+array[j]==targetsum)
        console.log(array[i] + "," + array[j]);
        }

        demo([1,2,3,4,0],3,6)

        //