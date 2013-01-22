<%@ Page Title="Meals" Language="vb" MasterPageFile="~/Site.Master" AutoEventWireup="false"
    CodeBehind="Meals.aspx.vb" Inherits="WebApplication2.About" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
    <h2>
        Your Meals
    </h2>
    <p>
      Your Meals
      <asp:ListBox ID="UserMeals" runat="server"></asp:ListBox> 
      </p>
     <p>
     Add a Meal: &nbsp 
    </p>
    <p>
        Recipes:</p>
    <p>
        <asp:ListBox ID="lstCurrentRecipes" runat="server"></asp:ListBox>
    </p>
    <p>
        Add a Recipe:<br />
         <asp:TextBox ID="txtAddToMeal" runat="server" Width="218px">Search for Recipe to add...</asp:TextBox> 
         <asp:Button ID="btnAddRecipeSearch" runat="server" Text="Search" /> <br />
        <asp:ListBox ID="LstSearchResults" runat="server"></asp:ListBox>
        <asp:Button ID="btnAddToMeal" runat="server" Text="Add" />
    </p>
    <p>
        Name your Meal:&nbsp;
    </p>
    <p>
        <asp:TextBox ID="txtMealName" runat="server" Text="meal name here"></asp:TextBox>
    </p>
    <p>
        <asp:Button ID="btnAddMeal" runat="server" Text="Upload Meal" />
    </p>
</asp:Content>

